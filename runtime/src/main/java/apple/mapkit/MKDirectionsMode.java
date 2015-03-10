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
@Library("MapKit")
public class MKDirectionsMode 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("MKLaunchOptionsDirectionsModeDriving")
    protected static native NSString DrivingValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("MKLaunchOptionsDirectionsModeWalking")
    protected static native NSString WalkingValue();
    
}
