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





@Library("UIKit/UIKit.h")
@Mapping("UITableViewCellSelectionStyle")
public final class UITableViewCellSelectionStyle extends ObjCEnum {
    
    @GlobalConstant("UITableViewCellSelectionStyleNone")
    public static final long None = 0L;
    @GlobalConstant("UITableViewCellSelectionStyleBlue")
    public static final long Blue = 1L;
    @GlobalConstant("UITableViewCellSelectionStyleGray")
    public static final long Gray = 2L;
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UITableViewCellSelectionStyleDefault")
    public static final long Default = 3L;
    

}
