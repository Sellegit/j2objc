package apple.coreimage;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.foundation.*;
import apple.opengles.*;
import apple.corevideo.*;
import apple.imageio.*;


@Library("CoreImage/CoreImage.h") @Mapping("CIQRCodeFeature")
public class CIQRCodeFeature 
    extends CIFeature 
     {

    
    
    @Mapping("init")
    public CIQRCodeFeature() { }

    
    @Mapping("bounds")
    public native CGRect getBounds();
    @Mapping("topLeft")
    public native CGPoint getTopLeft();
    @Mapping("topRight")
    public native CGPoint getTopRight();
    @Mapping("bottomLeft")
    public native CGPoint getBottomLeft();
    @Mapping("bottomRight")
    public native CGPoint getBottomRight();
    @Mapping("messageString")
    public native String getMessageString();

    
    


}
