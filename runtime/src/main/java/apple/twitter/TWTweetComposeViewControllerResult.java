package apple.twitter;


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
import apple.uikit.*;
import apple.social.*;
import apple.accounts.*;


@Library("Twitter/Twitter.h")
@Mapping("TWTweetComposeViewControllerResult")
public final class TWTweetComposeViewControllerResult extends ObjCEnum {
    
    @GlobalConstant("TWTweetComposeViewControllerResultCancelled")
    public static final long Cancelled = 0L;
    @GlobalConstant("TWTweetComposeViewControllerResultDone")
    public static final long Done = 1L;


}
