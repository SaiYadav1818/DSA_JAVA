public import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;

public class Main {
    static { System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }

    public static void main(String[] args) {
        // Path to the image file
        String imgPath = "path/to/your/image.jpg";
        
        // Path to the Haar cascade XML file for face detection
        String xmlFile = "resources/haarcascades/haarcascade_frontalface_default.xml";

        // Read the image
        Mat src = Imgcodecs.imread(imgPath);

        // Check if the image is loaded successfully
        if (src.empty()) {
            System.out.println("Could not load image at " + imgPath);
            return;
        }

        // Load the Haar cascade file
        CascadeClassifier faceDetector = new CascadeClassifier(xmlFile);

        // Detect faces in the image
        MatOfRect faceDetections = new MatOfRect();
        faceDetector.detectMultiScale(src, faceDetections);

        System.out.println(String.format("Detected %s faces", faceDetections.toArray().length));

        // Draw rectangles around each face
        for (Rect rect : faceDetections.toArray()) {
            Imgproc.rectangle(src, new Point(rect.x, rect.y), 
                new Point(rect.x + rect.width, rect.y + rect.height), 
                new Scalar(0, 255, 0));
        }

        // Save the output image
        String outputPath = "output.jpg";
        Imgcodecs.imwrite(outputPath, src);
        System.out.println("Face detection completed. Output saved at " + outputPath);
    }
}

