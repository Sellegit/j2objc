package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;


@Library("CoreFoundation/CoreFoundation.h")
@Mapping("CFGregorianUnitFlags")
public final class CFGregorianUnitFlags extends ObjCEnum {
    
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @GlobalConstant("kCFGregorianUnitsYears")
    public static final long UnitsYears = 1L;
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @GlobalConstant("kCFGregorianUnitsMonths")
    public static final long UnitsMonths = 2L;
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @GlobalConstant("kCFGregorianUnitsDays")
    public static final long UnitsDays = 4L;
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @GlobalConstant("kCFGregorianUnitsHours")
    public static final long UnitsHours = 8L;
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @GlobalConstant("kCFGregorianUnitsMinutes")
    public static final long UnitsMinutes = 16L;
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @GlobalConstant("kCFGregorianUnitsSeconds")
    public static final long UnitsSeconds = 32L;
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @GlobalConstant("kCFGregorianAllUnits")
    public static final long AllUnits = 16777215L;


}
