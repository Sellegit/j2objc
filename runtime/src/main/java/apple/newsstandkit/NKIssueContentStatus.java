package apple.newsstandkit;


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



/**
 * @since Available in iOS 5.0 and later.
 */

@Library("NewsstandKit")
@Mapping("NKIssueContentStatus")
public final class NKIssueContentStatus extends ObjCEnum {
    
    @GlobalConstant("NKIssueContentStatusNone")
    public static final long None = 0L;
    @GlobalConstant("NKIssueContentStatusDownloading")
    public static final long Downloading = 1L;
    @GlobalConstant("NKIssueContentStatusAvailable")
    public static final long Available = 2L;
    

}
