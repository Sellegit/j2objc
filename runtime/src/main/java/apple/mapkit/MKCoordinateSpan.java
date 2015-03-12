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





@Mapping("MKCoordinateSpan")
public class MKCoordinateSpan 
    extends Struct 
     {

    
    protected MKCoordinateSpan() {}
    
    
    @DotMapping("latitudeDelta")
    public native double getLatitudeDelta();
    @DotMapping("longitudeDelta")
    public native double getLongitudeDelta();
    
    public static native MKCoordinateSpan create(double latitudeDelta, double longitudeDelta) /*-[
        MKCoordinateSpan __new = { .latitudeDelta = latitudeDelta, .longitudeDelta = longitudeDelta };
        return __new;
    ]-*/;
    public static native MKCoordinateSpan copyWithlatitudeDelta(MKCoordinateSpan original, double latitudeDelta) /*-[
        original.latitudeDelta = latitudeDelta;
        return original;
    ]-*/;

    
    public static native MKCoordinateSpan copyWithlongitudeDelta(MKCoordinateSpan original, double longitudeDelta) /*-[
        original.longitudeDelta = longitudeDelta;
        return original;
    ]-*/;

    
}
