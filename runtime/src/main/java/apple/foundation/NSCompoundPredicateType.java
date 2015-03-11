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





@Library("Foundation")
@Mapping("NSCompoundPredicateType")
public final class NSCompoundPredicateType extends ObjCEnum {
    
    @GlobalConstant("NSNotPredicateType")
    public static final long Not = 0L;
    @GlobalConstant("NSAndPredicateType")
    public static final long And = 1L;
    @GlobalConstant("NSOrPredicateType")
    public static final long Or = 2L;
    

}
