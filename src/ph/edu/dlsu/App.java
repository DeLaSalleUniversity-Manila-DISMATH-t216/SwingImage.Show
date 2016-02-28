package ph.edu.dlsu;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import ph.edu.dlsu.util.ImageViewer;

public class App
{
    static{ System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }

    public static void main(String[] args) throws Exception {
        String filePath = "D:\\JC\\IP6\\New folder (2)\\IMG_3405.JPG";
        Mat newImage = Imgcodecs.imread(filePath);

        if(newImage.dataAddr()==0){
            System.out.println("Couldn't open file " + filePath);
        }else{
            ImageViewer imageViewer = new ImageViewer();
            imageViewer.show(newImage, "Loaded image");
        }

    }
}