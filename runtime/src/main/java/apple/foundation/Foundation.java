package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("Foundation/Foundation.h")
public class Foundation 
    extends Object 
     {

    
    public static final long PropertyListImmutable = 0L;
    public static final long PropertyListMutableContainers = 1L;
    public static final long PropertyListMutableContainersAndLeaves = 2L;
    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeURLKey")
    public static native NSString VolumeURLValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeIdentifierKey")
    public static native NSString VolumeIdentifierValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLFileResourceTypeKey")
    public static native NSString FileResourceTypeValue();
    /**
     * @since Available in iOS 8.2 and later.
     */
    @GlobalConstant("NSExtensionHostWillEnterForegroundNotification")
    public static native String ExtensionHostWillEnterForegroundNotification();
    /**
     * @since Available in iOS 8.2 and later.
     */
    @GlobalConstant("NSExtensionHostDidEnterBackgroundNotification")
    public static native String ExtensionHostDidEnterBackgroundNotification();
    /**
     * @since Available in iOS 8.2 and later.
     */
    @GlobalConstant("NSExtensionHostWillResignActiveNotification")
    public static native String ExtensionHostWillResignActiveNotification();
    /**
     * @since Available in iOS 8.2 and later.
     */
    @GlobalConstant("NSExtensionHostDidBecomeActiveNotification")
    public static native String ExtensionHostDidBecomeActiveNotification();
    
    @GlobalFunction("NSMakeRange")
    public static native NSRange function__NSMakeRange(@MachineSizedUInt long loc, @MachineSizedUInt long len);
    @GlobalFunction("NSMaxRange")
    public static native @MachineSizedUInt long function__NSMaxRange(NSRange range);
    @GlobalFunction("NSLocationInRange")
    public static native boolean function__NSLocationInRange(@MachineSizedUInt long loc, NSRange range);
    @GlobalFunction("NSEqualRanges")
    public static native boolean function__NSEqualRanges(NSRange range1, NSRange range2);
    @GlobalFunction("NSHostByteOrder")
    public static native @MachineSizedSInt long function__NSHostByteOrder();
    @GlobalFunction("NSSwapShort")
    public static native short function__NSSwapShort(short inv);
    @GlobalFunction("NSSwapInt")
    public static native int function__NSSwapInt(int inv);
    @GlobalFunction("NSSwapLong")
    public static native @MachineSizedUInt long function__NSSwapLong(@MachineSizedUInt long inv);
    @GlobalFunction("NSSwapLongLong")
    public static native long function__NSSwapLongLong(long inv);
    @GlobalFunction("NSSwapBigShortToHost")
    public static native short function__NSSwapBigShortToHost(short x);
    @GlobalFunction("NSSwapBigIntToHost")
    public static native int function__NSSwapBigIntToHost(int x);
    @GlobalFunction("NSSwapBigLongToHost")
    public static native @MachineSizedUInt long function__NSSwapBigLongToHost(@MachineSizedUInt long x);
    @GlobalFunction("NSSwapBigLongLongToHost")
    public static native long function__NSSwapBigLongLongToHost(long x);
    @GlobalFunction("NSSwapHostShortToBig")
    public static native short function__NSSwapHostShortToBig(short x);
    @GlobalFunction("NSSwapHostIntToBig")
    public static native int function__NSSwapHostIntToBig(int x);
    @GlobalFunction("NSSwapHostLongToBig")
    public static native @MachineSizedUInt long function__NSSwapHostLongToBig(@MachineSizedUInt long x);
    @GlobalFunction("NSSwapHostLongLongToBig")
    public static native long function__NSSwapHostLongLongToBig(long x);
    @GlobalFunction("NSSwapLittleShortToHost")
    public static native short function__NSSwapLittleShortToHost(short x);
    @GlobalFunction("NSSwapLittleIntToHost")
    public static native int function__NSSwapLittleIntToHost(int x);
    @GlobalFunction("NSSwapLittleLongToHost")
    public static native @MachineSizedUInt long function__NSSwapLittleLongToHost(@MachineSizedUInt long x);
    @GlobalFunction("NSSwapLittleLongLongToHost")
    public static native long function__NSSwapLittleLongLongToHost(long x);
    @GlobalFunction("NSSwapHostShortToLittle")
    public static native short function__NSSwapHostShortToLittle(short x);
    @GlobalFunction("NSSwapHostIntToLittle")
    public static native int function__NSSwapHostIntToLittle(int x);
    @GlobalFunction("NSSwapHostLongToLittle")
    public static native @MachineSizedUInt long function__NSSwapHostLongToLittle(@MachineSizedUInt long x);
    @GlobalFunction("NSSwapHostLongLongToLittle")
    public static native long function__NSSwapHostLongLongToLittle(long x);
    @GlobalFunction("NSConvertHostFloatToSwapped")
    public static native NSSwappedFloat function__NSConvertHostFloatToSwapped(float x);
    @GlobalFunction("NSConvertSwappedFloatToHost")
    public static native float function__NSConvertSwappedFloatToHost(NSSwappedFloat x);
    @GlobalFunction("NSConvertHostDoubleToSwapped")
    public static native NSSwappedDouble function__NSConvertHostDoubleToSwapped(double x);
    @GlobalFunction("NSConvertSwappedDoubleToHost")
    public static native double function__NSConvertSwappedDoubleToHost(NSSwappedDouble x);
    @GlobalFunction("NSSwapFloat")
    public static native NSSwappedFloat function__NSSwapFloat(NSSwappedFloat x);
    @GlobalFunction("NSSwapDouble")
    public static native NSSwappedDouble function__NSSwapDouble(NSSwappedDouble x);
    @GlobalFunction("NSSwapBigDoubleToHost")
    public static native double function__NSSwapBigDoubleToHost(NSSwappedDouble x);
    @GlobalFunction("NSSwapBigFloatToHost")
    public static native float function__NSSwapBigFloatToHost(NSSwappedFloat x);
    @GlobalFunction("NSSwapHostDoubleToBig")
    public static native NSSwappedDouble function__NSSwapHostDoubleToBig(double x);
    @GlobalFunction("NSSwapHostFloatToBig")
    public static native NSSwappedFloat function__NSSwapHostFloatToBig(float x);
    @GlobalFunction("NSSwapLittleDoubleToHost")
    public static native double function__NSSwapLittleDoubleToHost(NSSwappedDouble x);
    @GlobalFunction("NSSwapLittleFloatToHost")
    public static native float function__NSSwapLittleFloatToHost(NSSwappedFloat x);
    @GlobalFunction("NSSwapHostDoubleToLittle")
    public static native NSSwappedDouble function__NSSwapHostDoubleToLittle(double x);
    @GlobalFunction("NSSwapHostFloatToLittle")
    public static native NSSwappedFloat function__NSSwapHostFloatToLittle(float x);
    
}
