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

@Library("MapKit/MapKit.h") @Mapping("MKLocalSearch")
public class MKLocalSearch 
    extends NSObject 
     {

    
    
    public MKLocalSearch() {}
    @Mapping("initWithRequest:")
    public MKLocalSearch(MKLocalSearchRequest request) { }
    
    
    @Mapping("isSearching")
    public native boolean isSearching();
    
    
    
    @Mapping("cancel")
    public native void cancel();
    
}
