package apple.coreanimation;


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
import apple.coreimage.*;
import apple.coretext.*;
import apple.opengles.*;


@Library("QuartzCore/QuartzCore.h") @Mapping("CATextLayer")
public class CATextLayer 
    extends CALayer 
     {

    
    
    @Mapping("init")
    public CATextLayer() { }
    @Mapping("initWithLayer:")
    public CATextLayer(Object layer) { }
    @Mapping("initWithCoder:")
    public CATextLayer(NSCoder aDecoder) { }

    
    @Mapping("fontSize")
    public native @MachineSizedFloat double getFontSize();
    @Mapping("setFontSize:")
    public native void setFontSize(@MachineSizedFloat double v);
    @Mapping("foregroundColor")
    public native CGColor getForegroundColor();
    @Mapping("setForegroundColor:")
    public native void setForegroundColor(CGColor v);
    @Mapping("isWrapped")
    public native boolean isWrapped();
    @Mapping("setWrapped:")
    public native void setWrapped(boolean v);
    @Mapping("truncationMode")
    public native CATextTruncationMode getTruncationMode();
    @Mapping("setTruncationMode:")
    public native void setTruncationMode(CATextTruncationMode v);
    @Mapping("alignmentMode")
    public native CATextAlignmentMode getAlignmentMode();
    @Mapping("setAlignmentMode:")
    public native void setAlignmentMode(CATextAlignmentMode v);

    
    


}
