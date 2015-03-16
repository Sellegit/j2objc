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
 * @since Available in iOS 7.0 and later.
 */

@Library("MapKit/MapKit.h")
@Mapping("MKDistanceFormatterUnits")
public final class MKDistanceFormatterUnits extends ObjCEnum {
    
    @GlobalConstant("MKDistanceFormatterUnitsDefault")
    public static final long Default = 0L;
    @GlobalConstant("MKDistanceFormatterUnitsMetric")
    public static final long Metric = 1L;
    @GlobalConstant("MKDistanceFormatterUnitsImperial")
    public static final long Imperial = 2L;
    @GlobalConstant("MKDistanceFormatterUnitsImperialWithYards")
    public static final long ImperialWithYards = 3L;
    

}
