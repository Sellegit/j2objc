package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;





@Library("UIKit")
@Mapping("UIPrintInfoOutputType")
public final class UIPrintInfoOutputType extends ObjCEnum {
    
    @GlobalConstant("UIPrintInfoOutputGeneral")
    public static final long General = 0L;
    @GlobalConstant("UIPrintInfoOutputPhoto")
    public static final long Photo = 1L;
    @GlobalConstant("UIPrintInfoOutputGrayscale")
    public static final long Grayscale = 2L;
    @GlobalConstant("UIPrintInfoOutputPhotoGrayscale")
    public static final long PhotoGrayscale = 3L;
    

}
