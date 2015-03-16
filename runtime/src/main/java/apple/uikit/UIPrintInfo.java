package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;



/**
 * @since Available in iOS 4.2 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UIPrintInfo")
public class UIPrintInfo 
    extends NSObject 
    implements NSCopying, NSCoding {

    
    
    public UIPrintInfo() {}
    
    
    @Mapping("printerID")
    public native String getPrinterID();
    @Mapping("setPrinterID:")
    public native void setPrinterID(String v);
    @Mapping("jobName")
    public native String getJobName();
    @Mapping("setJobName:")
    public native void setJobName(String v);
    @Mapping("outputType")
    public native @Representing("UIPrintInfoOutputType") @MachineSizedSInt long getOutputType();
    @Mapping("setOutputType:")
    public native void setOutputType(@Representing("UIPrintInfoOutputType") @MachineSizedSInt long v);
    @Mapping("orientation")
    public native @Representing("UIPrintInfoOrientation") @MachineSizedSInt long getOrientation();
    @Mapping("setOrientation:")
    public native void setOrientation(@Representing("UIPrintInfoOrientation") @MachineSizedSInt long v);
    @Mapping("duplex")
    public native @Representing("UIPrintInfoDuplex") @MachineSizedSInt long getDuplex();
    @Mapping("setDuplex:")
    public native void setDuplex(@Representing("UIPrintInfoDuplex") @MachineSizedSInt long v);
    
    
    
    @Mapping("dictionaryRepresentation")
    public native NSDictionary<?, ?> toDictionary();
    @Mapping("printInfo")
    public static native UIPrintInfo getPrintInfo();
    @Mapping("printInfoWithDictionary:")
    public static native UIPrintInfo create(NSDictionary<?, ?> dictionary);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
