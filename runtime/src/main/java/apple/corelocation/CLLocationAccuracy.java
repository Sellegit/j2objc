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
@Library("CoreLocation")
public class CLLocationAccuracy 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCLLocationAccuracyBestForNavigation")
    protected static native double BestForNavigationValue();
    @GlobalConstant("kCLLocationAccuracyBest")
    protected static native double BestValue();
    @GlobalConstant("kCLLocationAccuracyNearestTenMeters")
    protected static native double NearestTenMetersValue();
    @GlobalConstant("kCLLocationAccuracyHundredMeters")
    protected static native double HundredMetersValue();
    @GlobalConstant("kCLLocationAccuracyKilometer")
    protected static native double KilometerValue();
    @GlobalConstant("kCLLocationAccuracyThreeKilometers")
    protected static native double ThreeKilometersValue();
    
}
