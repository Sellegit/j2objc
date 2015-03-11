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






@Mapping("NSKeyValueSetMutationKind")
public final class NSKeyValueSetMutationKind extends ObjCEnum {
    
    @GlobalConstant("NSKeyValueUnionSetMutation")
    public static final long Union = 1L;
    @GlobalConstant("NSKeyValueMinusSetMutation")
    public static final long Minus = 2L;
    @GlobalConstant("NSKeyValueIntersectSetMutation")
    public static final long Intersect = 3L;
    @GlobalConstant("NSKeyValueSetSetMutation")
    public static final long Set = 4L;
    

}
