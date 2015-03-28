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
@Mapping("MessageComposeResult")
public final class MessageComposeResult extends ObjCEnum {
    
    @GlobalConstant("MessageComposeResultCancelled")
    public static final long Cancelled = 0L;
    @GlobalConstant("MessageComposeResultSent")
    public static final long Sent = 1L;
    @GlobalConstant("MessageComposeResultFailed")
    public static final long Failed = 2L;


}
