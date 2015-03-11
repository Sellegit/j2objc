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





@Library("UIKit")
@Mapping("UITableViewCellAccessoryType")
public final class UITableViewCellAccessoryType extends ObjCEnum {
    
    @GlobalConstant("UITableViewCellAccessoryNone")
    public static final long None = 0L;
    @GlobalConstant("UITableViewCellAccessoryDisclosureIndicator")
    public static final long DisclosureIndicator = 1L;
    @GlobalConstant("UITableViewCellAccessoryDetailDisclosureButton")
    public static final long DetailDisclosureButton = 2L;
    @GlobalConstant("UITableViewCellAccessoryCheckmark")
    public static final long Checkmark = 3L;
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UITableViewCellAccessoryDetailButton")
    public static final long DetailButton = 4L;
    

}
