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
@Mapping("UITableViewCellStateMask")
public final class UITableViewCellStateMask extends ObjCEnum {
    
    @GlobalConstant("UITableViewCellStateDefaultMask")
    public static final long DefaultMask = 0L;
    @GlobalConstant("UITableViewCellStateShowingEditControlMask")
    public static final long ShowingEditControlMask = 1L;
    @GlobalConstant("UITableViewCellStateShowingDeleteConfirmationMask")
    public static final long ShowingDeleteConfirmationMask = 2L;
    

}
