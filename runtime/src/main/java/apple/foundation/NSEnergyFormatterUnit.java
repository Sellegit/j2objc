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



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("Foundation")
@Mapping("NSEnergyFormatterUnit")
public final class NSEnergyFormatterUnit extends ObjCEnum {
    
    @GlobalConstant("NSEnergyFormatterUnitJoule")
    public static final long Joule = 11L;
    @GlobalConstant("NSEnergyFormatterUnitKilojoule")
    public static final long Kilojoule = 14L;
    @GlobalConstant("NSEnergyFormatterUnitCalorie")
    public static final long Calorie = 1793L;
    @GlobalConstant("NSEnergyFormatterUnitKilocalorie")
    public static final long Kilocalorie = 1794L;
    

}
