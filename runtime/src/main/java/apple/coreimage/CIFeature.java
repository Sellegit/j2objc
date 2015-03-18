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





@Library("CoreImage/CoreImage.h") @Mapping("CIFeature")
public class CIFeature 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public CIFeature() { }
    
    
    @Mapping("type")
    public native String getType();
    @Mapping("bounds")
    public native CGRect getBounds();
    
    
    
    
    
}
