package apple.messageui;


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





@Library("MessageUI/MessageUI.h")
@Mapping("MFMailComposeResult")
public final class MFMailComposeResult extends ObjCEnum {
    
    @GlobalConstant("MFMailComposeResultCancelled")
    public static final long Cancelled = 0L;
    @GlobalConstant("MFMailComposeResultSaved")
    public static final long Saved = 1L;
    @GlobalConstant("MFMailComposeResultSent")
    public static final long Sent = 2L;
    @GlobalConstant("MFMailComposeResultFailed")
    public static final long Failed = 3L;
    

}
