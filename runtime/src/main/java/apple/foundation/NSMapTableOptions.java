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
@Mapping("NSMapTableOptions")
public final class NSMapTableOptions extends ObjCEnum {
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSMapTableStrongMemory")
    public static final long StrongMemory = 0L;
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSMapTableCopyIn")
    public static final long CopyIn = 65536L;
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSMapTableObjectPointerPersonality")
    public static final long ObjectPointerPersonality = 512L;
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSMapTableWeakMemory")
    public static final long WeakMemory = 5L;


}
