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

@Library("Foundation/Foundation.h")
@Mapping("NSMassFormatterUnit")
public final class NSMassFormatterUnit extends ObjCEnum {
    
    @GlobalConstant("NSMassFormatterUnitGram")
    public static final long Gram = 11L;
    @GlobalConstant("NSMassFormatterUnitKilogram")
    public static final long Kilogram = 14L;
    @GlobalConstant("NSMassFormatterUnitOunce")
    public static final long Ounce = 1537L;
    @GlobalConstant("NSMassFormatterUnitPound")
    public static final long Pound = 1538L;
    @GlobalConstant("NSMassFormatterUnitStone")
    public static final long Stone = 1539L;
    

}
