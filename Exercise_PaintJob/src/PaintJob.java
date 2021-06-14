import java.lang.Math;

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets)
    {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)
        {
            return -1;
        }
        else {
            double areaOfBuckets = width * height;

            double neededBucket = (areaOfBuckets / areaPerBucket) - extraBuckets;
            return (int) Math.ceil(neededBucket);
        }

    }


    public static int getBucketCount(double width, double height, double areaPerBucket)
    {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0)
        {
            return -1;
        }
        else {
            double areaOfBuckets = width * height;

            double neededBucket = (areaOfBuckets / areaPerBucket);
            return (int) Math.ceil(neededBucket);
        }

    }

    public static int getBucketCount(double area, double areaPerBucket)
    {
        if (area <= 0 || areaPerBucket <= 0)
        {
            return -1;
        }
        else {

            double neededBucket = (area / areaPerBucket);
            return (int) Math.ceil(neededBucket);
        }

    }
}
