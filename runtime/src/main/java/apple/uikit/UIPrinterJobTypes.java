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
 * @since Available in iOS 8.0 and later.
 */


@Mapping("UIPrinterJobTypes")
public final class UIPrinterJobTypes extends ObjCEnum {
    
    @GlobalConstant("UIPrinterJobTypeUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("UIPrinterJobTypeDocument")
    public static final long Document = 1L;
    @GlobalConstant("UIPrinterJobTypeEnvelope")
    public static final long Envelope = 2L;
    @GlobalConstant("UIPrinterJobTypeLabel")
    public static final long Label = 4L;
    @GlobalConstant("UIPrinterJobTypePhoto")
    public static final long Photo = 8L;
    @GlobalConstant("UIPrinterJobTypeReceipt")
    public static final long Receipt = 16L;
    @GlobalConstant("UIPrinterJobTypeRoll")
    public static final long Roll = 32L;
    @GlobalConstant("UIPrinterJobTypeLargeFormat")
    public static final long LargeFormat = 64L;
    @GlobalConstant("UIPrinterJobTypePostcard")
    public static final long Postcard = 128L;
    

}
