package apple.mapkit;


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
import apple.corelocation.*;
import apple.uikit.*;
import apple.dispatch.*;



/**
 * @since Available in iOS 3.0 and later.
 */

@Library("MapKit/MapKit.h")
@Mapping("MKPinAnnotationColor")
public final class MKPinAnnotationColor extends ObjCEnum {
    
    @GlobalConstant("MKPinAnnotationColorRed")
    public static final long Red = 0L;
    @GlobalConstant("MKPinAnnotationColorGreen")
    public static final long Green = 1L;
    @GlobalConstant("MKPinAnnotationColorPurple")
    public static final long Purple = 2L;
    

}
