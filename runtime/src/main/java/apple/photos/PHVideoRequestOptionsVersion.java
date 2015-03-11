package apple.photos;


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
import apple.foundation.*;
import apple.corelocation.*;
import apple.uikit.*;
import apple.avfoundation.*;



/**
 * @since Available in iOS 8.0 and later.
 */


@Mapping("PHVideoRequestOptionsVersion")
public final class PHVideoRequestOptionsVersion extends ObjCEnum {
    
    @GlobalConstant("PHVideoRequestOptionsVersionCurrent")
    public static final long Current = 0L;
    @GlobalConstant("PHVideoRequestOptionsVersionOriginal")
    public static final long Original = 1L;
    

}
