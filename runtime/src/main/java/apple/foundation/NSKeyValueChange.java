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
@Mapping("NSKeyValueChange")
public final class NSKeyValueChange extends ObjCEnum {
    
    @GlobalConstant("NSKeyValueChangeSetting")
    public static final long Setting = 1L;
    @GlobalConstant("NSKeyValueChangeInsertion")
    public static final long Insertion = 2L;
    @GlobalConstant("NSKeyValueChangeRemoval")
    public static final long Removal = 3L;
    @GlobalConstant("NSKeyValueChangeReplacement")
    public static final long Replacement = 4L;
    

}
