package apple.corefoundation;


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
import apple.foundation.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreFoundation/CoreFoundation.h")
public class CFBundle 
    extends CFType 
     {

    
    
    protected CFBundle() {}
    
    
    
    
    @GlobalFunction("CFBundleGetMainBundle")
    public static native CFBundle getMainBundle();
    @GlobalFunction("CFBundleGetBundleWithIdentifier")
    public static native CFBundle getBundleWithIdentifier(String bundleID);
    @GlobalFunction("CFBundleGetAllBundles")
    public static native CFArray getAllBundles();
    @GlobalFunction("CFBundleGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFBundleCreate")
    public static native CFBundle create(CFAllocator allocator, CFURL bundleURL);
    @GlobalFunction("CFBundleCreateBundlesFromDirectory")
    public static native CFArray createBundlesFromDirectory(CFAllocator allocator, CFURL directoryURL, String bundleType);
    @GlobalFunction("CFBundleCopyBundleURL")
    public static native CFURL copyBundleURL(CFBundle bundle);
    @GlobalFunction("CFBundleGetValueForInfoDictionaryKey")
    public static native CFType getValueForInfoDictionaryKey(CFBundle bundle, String key);
    @GlobalFunction("CFBundleGetInfoDictionary")
    public static native CFDictionary getInfoDictionary(CFBundle bundle);
    @GlobalFunction("CFBundleGetLocalInfoDictionary")
    public static native CFDictionary getLocalInfoDictionary(CFBundle bundle);
    @GlobalFunction("CFBundleGetPackageInfo")
    public static native void getPackageInfo(CFBundle bundle, Todo packageType, Todo packageCreator);
    @GlobalFunction("CFBundleGetIdentifier")
    public static native String getIdentifier(CFBundle bundle);
    @GlobalFunction("CFBundleGetVersionNumber")
    public static native int getVersionNumber(CFBundle bundle);
    @GlobalFunction("CFBundleGetDevelopmentRegion")
    public static native String getDevelopmentRegion(CFBundle bundle);
    @GlobalFunction("CFBundleCopySupportFilesDirectoryURL")
    public static native CFURL copySupportFilesDirectoryURL(CFBundle bundle);
    @GlobalFunction("CFBundleCopyResourcesDirectoryURL")
    public static native CFURL copyResourcesDirectoryURL(CFBundle bundle);
    @GlobalFunction("CFBundleCopyPrivateFrameworksURL")
    public static native CFURL copyPrivateFrameworksURL(CFBundle bundle);
    @GlobalFunction("CFBundleCopySharedFrameworksURL")
    public static native CFURL copySharedFrameworksURL(CFBundle bundle);
    @GlobalFunction("CFBundleCopySharedSupportURL")
    public static native CFURL copySharedSupportURL(CFBundle bundle);
    @GlobalFunction("CFBundleCopyBuiltInPlugInsURL")
    public static native CFURL copyBuiltInPlugInsURL(CFBundle bundle);
    @GlobalFunction("CFBundleCopyInfoDictionaryInDirectory")
    public static native CFDictionary copyInfoDictionaryInDirectory(CFURL bundleURL);
    @GlobalFunction("CFBundleGetPackageInfoInDirectory")
    public static native boolean getPackageInfoInDirectory(CFURL url, Todo packageType, Todo packageCreator);
    @GlobalFunction("CFBundleCopyResourceURL")
    public static native CFURL copyResourceURL(CFBundle bundle, String resourceName, String resourceType, String subDirName);
    @GlobalFunction("CFBundleCopyResourceURLsOfType")
    public static native CFArray copyResourceURLsOfType(CFBundle bundle, String resourceType, String subDirName);
    @GlobalFunction("CFBundleCopyLocalizedString")
    public static native String copyLocalizedString(CFBundle bundle, String key, String value, String tableName);
    @GlobalFunction("CFBundleCopyResourceURLInDirectory")
    public static native CFURL copyResourceURLInDirectory(CFURL bundleURL, String resourceName, String resourceType, String subDirName);
    @GlobalFunction("CFBundleCopyResourceURLsOfTypeInDirectory")
    public static native CFArray copyResourceURLsOfTypeInDirectory(CFURL bundleURL, String resourceType, String subDirName);
    @GlobalFunction("CFBundleCopyBundleLocalizations")
    public static native CFArray copyBundleLocalizations(CFBundle bundle);
    @GlobalFunction("CFBundleCopyPreferredLocalizationsFromArray")
    public static native CFArray copyPreferredLocalizationsFromArray(CFArray locArray);
    @GlobalFunction("CFBundleCopyLocalizationsForPreferences")
    public static native CFArray copyLocalizationsForPreferences(CFArray locArray, CFArray prefArray);
    @GlobalFunction("CFBundleCopyResourceURLForLocalization")
    public static native CFURL copyResourceURLForLocalization(CFBundle bundle, String resourceName, String resourceType, String subDirName, String localizationName);
    @GlobalFunction("CFBundleCopyResourceURLsOfTypeForLocalization")
    public static native CFArray copyResourceURLsOfTypeForLocalization(CFBundle bundle, String resourceType, String subDirName, String localizationName);
    @GlobalFunction("CFBundleCopyInfoDictionaryForURL")
    public static native CFDictionary copyInfoDictionaryForURL(CFURL url);
    @GlobalFunction("CFBundleCopyLocalizationsForURL")
    public static native CFArray copyLocalizationsForURL(CFURL url);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFBundleCopyExecutableArchitecturesForURL")
    public static native CFArray copyExecutableArchitecturesForURL(CFURL url);
    @GlobalFunction("CFBundleCopyExecutableURL")
    public static native CFURL copyExecutableURL(CFBundle bundle);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFBundleCopyExecutableArchitectures")
    public static native CFArray copyExecutableArchitectures(CFBundle bundle);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFBundlePreflightExecutable")
    public static native boolean preflightExecutable(CFBundle bundle, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFBundleLoadExecutableAndReturnError")
    public static native boolean loadExecutableAndReturnError(CFBundle bundle, Todo error);
    @GlobalFunction("CFBundleLoadExecutable")
    public static native boolean loadExecutable(CFBundle bundle);
    @GlobalFunction("CFBundleIsExecutableLoaded")
    public static native boolean isExecutableLoaded(CFBundle bundle);
    @GlobalFunction("CFBundleUnloadExecutable")
    public static native void unloadExecutable(CFBundle bundle);
    @GlobalFunction("CFBundleGetFunctionPointerForName")
    public static native Todo getFunctionPointerForName(CFBundle bundle, String functionName);
    @GlobalFunction("CFBundleGetFunctionPointersForNames")
    public static native void getFunctionPointersForNames(CFBundle bundle, CFArray functionNames, Todo ftbl);
    @GlobalFunction("CFBundleGetDataPointerForName")
    public static native Todo getDataPointerForName(CFBundle bundle, String symbolName);
    @GlobalFunction("CFBundleGetDataPointersForNames")
    public static native void getDataPointersForNames(CFBundle bundle, CFArray symbolNames, Todo stbl);
    @GlobalFunction("CFBundleCopyAuxiliaryExecutableURL")
    public static native CFURL copyAuxiliaryExecutableURL(CFBundle bundle, String executableName);
    @GlobalFunction("CFBundleGetPlugIn")
    public static native CFPlugIn getPlugIn(CFBundle bundle);
    @GlobalFunction("CFBundleOpenBundleResourceMap")
    public static native short openBundleResourceMap(CFBundle bundle);
    @GlobalFunction("CFBundleOpenBundleResourceFiles")
    public static native int openBundleResourceFiles(CFBundle bundle, Todo refNum, Todo localizedRefNum);
    @GlobalFunction("CFBundleCloseBundleResourceMap")
    public static native void closeBundleResourceMap(CFBundle bundle, short refNum);
    
}
