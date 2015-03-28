package apple.accounts;


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


@Library("Accounts/Accounts.h")
@Mapping("ACAccountCredentialRenewResult")
public final class ACAccountCredentialRenewResult extends ObjCEnum {
    
    @GlobalConstant("ACAccountCredentialRenewResultRenewed")
    public static final long Renewed = 0L;
    @GlobalConstant("ACAccountCredentialRenewResultRejected")
    public static final long Rejected = 1L;
    @GlobalConstant("ACAccountCredentialRenewResultFailed")
    public static final long Failed = 2L;


}
