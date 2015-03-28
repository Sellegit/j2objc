package apple.social;


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
import apple.accounts.*;


@Library("Social/Social.h")
@Mapping("SLComposeViewControllerResult")
public final class SLComposeViewControllerResult extends ObjCEnum {
    
    @GlobalConstant("SLComposeViewControllerResultCancelled")
    public static final long Cancelled = 0L;
    @GlobalConstant("SLComposeViewControllerResultDone")
    public static final long Done = 1L;


}
