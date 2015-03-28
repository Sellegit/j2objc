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
    public static native NSString DirectionsModeKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("MKLaunchOptionsMapTypeKey")
    public static native NSString MapTypeKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("MKLaunchOptionsShowsTrafficKey")
    public static native NSString ShowsTrafficKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("MKLaunchOptionsMapCenterKey")
    public static native NSString MapCenterKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("MKLaunchOptionsMapSpanKey")
    public static native NSString MapSpanKey();
    /**
     * @since Available in iOS 7.1 and later.
     */
    @GlobalConstant("MKLaunchOptionsCameraKey")
    public static native NSString CameraKey();

}
