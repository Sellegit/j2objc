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





@Library("MessageUI")
@Mapping("MFMailComposeErrorCode")
public final class MFMailComposeErrorCode extends ObjCEnum {
    
    @GlobalConstant("MFMailComposeErrorCodeSaveFailed")
    public static final long SaveFailed = 0L;
    @GlobalConstant("MFMailComposeErrorCodeSendFailed")
    public static final long SendFailed = 1L;
    

}
