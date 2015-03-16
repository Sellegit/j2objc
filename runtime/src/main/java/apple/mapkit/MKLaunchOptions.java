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


/*<javadoc>*/
/*</javadoc>*/
@Library("MapKit/MapKit.h")
public class MKLaunchOptions 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("MKLaunchOptionsDirectionsModeKey")
    protected static native NSString DirectionsModeKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("MKLaunchOptionsMapTypeKey")
    protected static native NSString MapTypeKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("MKLaunchOptionsShowsTrafficKey")
    protected static native NSString ShowsTrafficKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("MKLaunchOptionsMapCenterKey")
    protected static native NSString MapCenterKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("MKLaunchOptionsMapSpanKey")
    protected static native NSString MapSpanKey();
    /**
     * @since Available in iOS 7.1 and later.
     */
    @GlobalConstant("MKLaunchOptionsCameraKey")
    protected static native NSString CameraKey();
    
}
