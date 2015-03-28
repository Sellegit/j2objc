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


@Library("Foundation/Foundation.h")
@Mapping("NSComparisonPredicateModifier")
public final class NSComparisonPredicateModifier extends ObjCEnum {
    
    @GlobalConstant("NSDirectPredicateModifier")
    public static final long Direct = 0L;
    @GlobalConstant("NSAllPredicateModifier")
    public static final long All = 1L;
    @GlobalConstant("NSAnyPredicateModifier")
    public static final long Any = 2L;


}
