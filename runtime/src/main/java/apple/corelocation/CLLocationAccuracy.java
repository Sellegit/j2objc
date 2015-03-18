package apple.corelocation;


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
import apple.addressbook.*;
import apple.corebluetooth.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreLocation/CoreLocation.h")
public class CLLocationAccuracy 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCLLocationAccuracyBestForNavigation")
    public static native double BestForNavigationValue();
    @GlobalConstant("kCLLocationAccuracyBest")
    public static native double BestValue();
    @GlobalConstant("kCLLocationAccuracyNearestTenMeters")
    public static native double NearestTenMetersValue();
    @GlobalConstant("kCLLocationAccuracyHundredMeters")
    public static native double HundredMetersValue();
    @GlobalConstant("kCLLocationAccuracyKilometer")
    public static native double KilometerValue();
    @GlobalConstant("kCLLocationAccuracyThreeKilometers")
    public static native double ThreeKilometersValue();
    
}
