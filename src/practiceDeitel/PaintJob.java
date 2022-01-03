package practiceDeitel;

public class PaintJob {
    public  static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        double getBucket;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        else{
            double area = 0;
            area = width * height;

            getBucket = area / areaPerBucket;

            getBucket = getBucket - extraBuckets;
            getBucket = Math.ceil(getBucket);
        }
        return (int) getBucket;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        double getBucket;

        if (width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        else {
            double area = 0;
            area = width * height;

            getBucket = area / areaPerBucket;
            getBucket = Math.ceil(getBucket);
        }
        return (int) getBucket;
    }

    public static int getBucketCount(double area, double areaPerBucket){
        double getBucket;
        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        else{
            getBucket = area / areaPerBucket;
            getBucket = Math.ceil(getBucket);
        }
        return (int) getBucket;
    }
}
