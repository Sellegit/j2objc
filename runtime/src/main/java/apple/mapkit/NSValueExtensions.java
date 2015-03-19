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
public final class NSValueExtensions 
    extends NSExtensions 
     {

    
    
    private NSValueExtensions() {}
    
    
    
    
    
    
    @Mapping("valueWithMKCoordinate:")
    public static native NSValue createPrime(CLLocationCoordinate2D coordinate);
    @Mapping("valueWithMKCoordinateSpan:")
    public static native NSValue createPrime(MKCoordinateSpan span);
    
}
