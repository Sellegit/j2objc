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






@Mapping("NSCalendarOptions")
public final class NSCalendarOptions extends ObjCEnum {
    
    @GlobalConstant("NSCalendarWrapComponents")
    public static final long WrapComponents = 1L;
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSCalendarMatchStrictly")
    public static final long MatchStrictly = 2L;
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSCalendarSearchBackwards")
    public static final long SearchBackwards = 4L;
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSCalendarMatchPreviousTimePreservingSmallerUnits")
    public static final long MatchPreviousTimePreservingSmallerUnits = 256L;
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSCalendarMatchNextTimePreservingSmallerUnits")
    public static final long MatchNextTimePreservingSmallerUnits = 512L;
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSCalendarMatchNextTime")
    public static final long MatchNextTime = 1024L;
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSCalendarMatchFirst")
    public static final long MatchFirst = 4096L;
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSCalendarMatchLast")
    public static final long MatchLast = 8192L;
    

}
