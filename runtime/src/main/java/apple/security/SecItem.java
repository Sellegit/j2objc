package apple.security;


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
import apple.dispatch.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("Security")
public class SecItem 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecClass")
    public static native CFType Class();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecClassGenericPassword")
    public static native CFType ClassGenericPassword();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecClassInternetPassword")
    public static native CFType ClassInternetPassword();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecClassCertificate")
    public static native CFType ClassCertificate();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecClassKey")
    public static native CFType ClassKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecClassIdentity")
    public static native CFType ClassIdentity();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kSecAttrAccessible")
    public static native CFType AttrAccessible();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kSecAttrAccessControl")
    public static native CFType AttrAccessControl();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kSecAttrAccessGroup")
    public static native CFType AttrAccessGroup();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kSecAttrSynchronizable")
    public static native CFType AttrSynchronizable();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kSecAttrSynchronizableAny")
    public static native CFType AttrSynchronizableAny();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrCreationDate")
    public static native CFType AttrCreationDate();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrModificationDate")
    public static native CFType AttrModificationDate();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrDescription")
    public static native CFType AttrDescription();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrComment")
    public static native CFType AttrComment();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrCreator")
    public static native CFType AttrCreator();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrType")
    public static native CFType AttrType();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrLabel")
    public static native CFType AttrLabel();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrIsInvisible")
    public static native CFType AttrIsInvisible();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrIsNegative")
    public static native CFType AttrIsNegative();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrAccount")
    public static native CFType AttrAccount();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrService")
    public static native CFType AttrService();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrGeneric")
    public static native CFType AttrGeneric();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrSecurityDomain")
    public static native CFType AttrSecurityDomain();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrServer")
    public static native CFType AttrServer();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocol")
    public static native CFType AttrProtocol();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrAuthenticationType")
    public static native CFType AttrAuthenticationType();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrPort")
    public static native CFType AttrPort();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrPath")
    public static native CFType AttrPath();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrSubject")
    public static native CFType AttrSubject();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrIssuer")
    public static native CFType AttrIssuer();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrSerialNumber")
    public static native CFType AttrSerialNumber();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrSubjectKeyID")
    public static native CFType AttrSubjectKeyID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrPublicKeyHash")
    public static native CFType AttrPublicKeyHash();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrCertificateType")
    public static native CFType AttrCertificateType();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrCertificateEncoding")
    public static native CFType AttrCertificateEncoding();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrKeyClass")
    public static native CFType AttrKeyClass();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrApplicationLabel")
    public static native CFType AttrApplicationLabel();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrIsPermanent")
    public static native CFType AttrIsPermanent();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrApplicationTag")
    public static native CFType AttrApplicationTag();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrKeyType")
    public static native CFType AttrKeyType();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrKeySizeInBits")
    public static native CFType AttrKeySizeInBits();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrEffectiveKeySize")
    public static native CFType AttrEffectiveKeySize();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrCanEncrypt")
    public static native CFType AttrCanEncrypt();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrCanDecrypt")
    public static native CFType AttrCanDecrypt();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrCanDerive")
    public static native CFType AttrCanDerive();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrCanSign")
    public static native CFType AttrCanSign();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrCanVerify")
    public static native CFType AttrCanVerify();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrCanWrap")
    public static native CFType AttrCanWrap();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrCanUnwrap")
    public static native CFType AttrCanUnwrap();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kSecAttrAccessibleWhenUnlocked")
    public static native CFType AttrAccessibleWhenUnlocked();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kSecAttrAccessibleAfterFirstUnlock")
    public static native CFType AttrAccessibleAfterFirstUnlock();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kSecAttrAccessibleAlways")
    public static native CFType AttrAccessibleAlways();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kSecAttrAccessibleWhenPasscodeSetThisDeviceOnly")
    public static native CFType AttrAccessibleWhenPasscodeSetThisDeviceOnly();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kSecAttrAccessibleWhenUnlockedThisDeviceOnly")
    public static native CFType AttrAccessibleWhenUnlockedThisDeviceOnly();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kSecAttrAccessibleAfterFirstUnlockThisDeviceOnly")
    public static native CFType AttrAccessibleAfterFirstUnlockThisDeviceOnly();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kSecAttrAccessibleAlwaysThisDeviceOnly")
    public static native CFType AttrAccessibleAlwaysThisDeviceOnly();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolFTP")
    public static native CFType AttrProtocolFTP();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolFTPAccount")
    public static native CFType AttrProtocolFTPAccount();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolHTTP")
    public static native CFType AttrProtocolHTTP();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolIRC")
    public static native CFType AttrProtocolIRC();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolNNTP")
    public static native CFType AttrProtocolNNTP();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolPOP3")
    public static native CFType AttrProtocolPOP3();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolSMTP")
    public static native CFType AttrProtocolSMTP();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolSOCKS")
    public static native CFType AttrProtocolSOCKS();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolIMAP")
    public static native CFType AttrProtocolIMAP();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolLDAP")
    public static native CFType AttrProtocolLDAP();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolAppleTalk")
    public static native CFType AttrProtocolAppleTalk();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolAFP")
    public static native CFType AttrProtocolAFP();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolTelnet")
    public static native CFType AttrProtocolTelnet();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolSSH")
    public static native CFType AttrProtocolSSH();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolFTPS")
    public static native CFType AttrProtocolFTPS();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolHTTPS")
    public static native CFType AttrProtocolHTTPS();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolHTTPProxy")
    public static native CFType AttrProtocolHTTPProxy();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolHTTPSProxy")
    public static native CFType AttrProtocolHTTPSProxy();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolFTPProxy")
    public static native CFType AttrProtocolFTPProxy();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolSMB")
    public static native CFType AttrProtocolSMB();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolRTSP")
    public static native CFType AttrProtocolRTSP();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolRTSPProxy")
    public static native CFType AttrProtocolRTSPProxy();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolDAAP")
    public static native CFType AttrProtocolDAAP();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolEPPC")
    public static native CFType AttrProtocolEPPC();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolIPP")
    public static native CFType AttrProtocolIPP();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolNNTPS")
    public static native CFType AttrProtocolNNTPS();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolLDAPS")
    public static native CFType AttrProtocolLDAPS();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolTelnetS")
    public static native CFType AttrProtocolTelnetS();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolIMAPS")
    public static native CFType AttrProtocolIMAPS();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolIRCS")
    public static native CFType AttrProtocolIRCS();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrProtocolPOP3S")
    public static native CFType AttrProtocolPOP3S();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrAuthenticationTypeNTLM")
    public static native CFType AttrAuthenticationTypeNTLM();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrAuthenticationTypeMSN")
    public static native CFType AttrAuthenticationTypeMSN();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrAuthenticationTypeDPA")
    public static native CFType AttrAuthenticationTypeDPA();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrAuthenticationTypeRPA")
    public static native CFType AttrAuthenticationTypeRPA();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrAuthenticationTypeHTTPBasic")
    public static native CFType AttrAuthenticationTypeHTTPBasic();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrAuthenticationTypeHTTPDigest")
    public static native CFType AttrAuthenticationTypeHTTPDigest();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrAuthenticationTypeHTMLForm")
    public static native CFType AttrAuthenticationTypeHTMLForm();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrAuthenticationTypeDefault")
    public static native CFType AttrAuthenticationTypeDefault();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrKeyClassPublic")
    public static native CFType AttrKeyClassPublic();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrKeyClassPrivate")
    public static native CFType AttrKeyClassPrivate();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrKeyClassSymmetric")
    public static native CFType AttrKeyClassSymmetric();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecAttrKeyTypeRSA")
    public static native CFType AttrKeyTypeRSA();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kSecAttrKeyTypeEC")
    public static native CFType AttrKeyTypeEC();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecMatchPolicy")
    public static native CFType MatchPolicy();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecMatchItemList")
    public static native CFType MatchItemList();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecMatchSearchList")
    public static native CFType MatchSearchList();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecMatchIssuers")
    public static native CFType MatchIssuers();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecMatchEmailAddressIfPresent")
    public static native CFType MatchEmailAddressIfPresent();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecMatchSubjectContains")
    public static native CFType MatchSubjectContains();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecMatchCaseInsensitive")
    public static native CFType MatchCaseInsensitive();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecMatchTrustedOnly")
    public static native CFType MatchTrustedOnly();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecMatchValidOnDate")
    public static native CFType MatchValidOnDate();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecMatchLimit")
    public static native CFType MatchLimit();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecMatchLimitOne")
    public static native CFType MatchLimitOne();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecMatchLimitAll")
    public static native CFType MatchLimitAll();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecReturnData")
    public static native CFType ReturnData();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecReturnAttributes")
    public static native CFType ReturnAttributes();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecReturnRef")
    public static native CFType ReturnRef();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecReturnPersistentRef")
    public static native CFType ReturnPersistentRef();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecValueData")
    public static native CFType ValueData();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecValueRef")
    public static native CFType ValueRef();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecValuePersistentRef")
    public static native CFType ValuePersistentRef();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecUseItemList")
    public static native CFType UseItemList();
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecItemCopyMatching")
    public static native int copyMatching(CFDictionary query, Todo result);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecItemAdd")
    public static native int add(CFDictionary attributes, Todo result);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecItemUpdate")
    public static native int update(CFDictionary query, CFDictionary attributesToUpdate);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecItemDelete")
    public static native int delete(CFDictionary query);
    
}
