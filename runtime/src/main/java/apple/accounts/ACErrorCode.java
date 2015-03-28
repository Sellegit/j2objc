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
@Mapping("ACErrorCode")
public final class ACErrorCode extends ObjCEnum {
    
    @GlobalConstant("ACErrorUnknown")
    public static final long Unknown = 1L;
    @GlobalConstant("ACErrorAccountMissingRequiredProperty")
    public static final long AccountMissingRequiredProperty = 2L;
    @GlobalConstant("ACErrorAccountAuthenticationFailed")
    public static final long AccountAuthenticationFailed = 3L;
    @GlobalConstant("ACErrorAccountTypeInvalid")
    public static final long AccountTypeInvalid = 4L;
    @GlobalConstant("ACErrorAccountAlreadyExists")
    public static final long AccountAlreadyExists = 5L;
    @GlobalConstant("ACErrorAccountNotFound")
    public static final long AccountNotFound = 6L;
    @GlobalConstant("ACErrorPermissionDenied")
    public static final long PermissionDenied = 7L;
    @GlobalConstant("ACErrorAccessInfoInvalid")
    public static final long AccessInfoInvalid = 8L;
    @GlobalConstant("ACErrorClientPermissionDenied")
    public static final long ClientPermissionDenied = 9L;
    @GlobalConstant("ACErrorAccessDeniedByProtectionPolicy")
    public static final long AccessDeniedByProtectionPolicy = 10L;
    @GlobalConstant("ACErrorCredentialNotFound")
    public static final long CredentialNotFound = 11L;
    @GlobalConstant("ACErrorFetchCredentialFailed")
    public static final long FetchCredentialFailed = 12L;
    @GlobalConstant("ACErrorStoreCredentialFailed")
    public static final long StoreCredentialFailed = 13L;
    @GlobalConstant("ACErrorRemoveCredentialFailed")
    public static final long RemoveCredentialFailed = 14L;
    @GlobalConstant("ACErrorUpdatingNonexistentAccount")
    public static final long UpdatingNonexistentAccount = 15L;
    @GlobalConstant("ACErrorInvalidClientBundleID")
    public static final long InvalidClientBundleID = 16L;
    @GlobalConstant("ACErrorDeniedByPlugin")
    public static final long DeniedByPlugin = 17L;
    @GlobalConstant("ACErrorCoreDataSaveFailed")
    public static final long CoreDataSaveFailed = 18L;
    @GlobalConstant("ACErrorFailedSerializingAccountInfo")
    public static final long FailedSerializingAccountInfo = 19L;
    @GlobalConstant("ACErrorInvalidCommand")
    public static final long InvalidCommand = 20L;
    @GlobalConstant("ACErrorMissingTransportMessageID")
    public static final long MissingTransportMessageID = 21L;


}
