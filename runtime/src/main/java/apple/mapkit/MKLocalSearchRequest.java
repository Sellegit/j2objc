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
 * @since Available in iOS 6.1 and later.
 */

@Library("MapKit/MapKit.h") @Mapping("MKLocalSearchRequest")
public class MKLocalSearchRequest 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public MKLocalSearchRequest() { }
    
    
    @Mapping("naturalLanguageQuery")
    public native String getNaturalLanguageQuery();
    @Mapping("setNaturalLanguageQuery:")
    public native void setNaturalLanguageQuery(String v);
    @Mapping("region")
    public native MKCoordinateRegion getRegion();
    @Mapping("setRegion:")
    public native void setRegion(MKCoordinateRegion v);
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
