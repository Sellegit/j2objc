package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("UIKit")
@Mapping("UITableViewRowActionStyle")
public final class UITableViewRowActionStyle extends ObjCEnum {
    
    @GlobalConstant("UITableViewRowActionStyleDefault")
    public static final long Default = 0L;
    @GlobalConstant("UITableViewRowActionStyleDestructive")
    public static final long Destructive = 0L;
    @GlobalConstant("UITableViewRowActionStyleNormal")
    public static final long Normal = 1L;
    

}
