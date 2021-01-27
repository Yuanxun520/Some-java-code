class Range{
    private long[] array;
    private int lowIndex;
    private int highIndex;

    public Range(long[] array){
        this.array = array;
        this.lowIndex = 0;
        this.highIndex = array.length-1;
    }

    public int size(){
        return highIndex - lowIndex + 1;
    }

    public long getMiddleValue(){
        return array[getMiddleIndex()];
    }

    public int getMiddleIndex(){
        return (lowIndex + highIndex)/2;
    }

    public void discardRightPart(){
        highIndex = getMiddleIndex() - 1;
    }
    public void discardLeftPart(){
        lowIndex = getMiddleIndex() + 1;
    }
}

public class BinarySearch {
    public static int binarySearch(long[] array, long target){
        Range range = new Range(array);
        while (range.size() > 0){
            long middleValue = range.getMiddleValue();
            if (middleValue == middleValue){
                return range.getMiddleIndex();
            }else if (middleValue < middleValue){
                range.discardRightPart();
            }else{
                range.discardLeftPart();
            }
        }
        return -1;
    }
}
