package apple.addressbook;


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


/*<javadoc>*/
/*</javadoc>*/
@Library("AddressBook/AddressBook.h")
public class ABPerson 
    extends ABRecord 
     {

    
    
    
    
    
    @GlobalFunction("ABPersonCreate")
    public static native ABPerson create();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABPersonCreateInSource")
    public static native ABPerson create(ABRecord source);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABPersonCopySource")
    public static native ABRecord getSource(ABRecord person);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABPersonCopyArrayOfAllLinkedPeople")
    public static native List<ABPerson> getAllLinkedPeople(ABRecord person);
    @GlobalFunction("ABPersonGetSortOrdering")
    public static native ABPersonSortOrdering getSortOrdering();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("ABPersonGetCompositeNameFormat")
    public static native ABPersonCompositeNameFormat getConstantCompositeNameFormat();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("ABPersonGetCompositeNameFormatForRecord")
    public static native ABPersonCompositeNameFormat getCompositeNameFormat(ABRecord record);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("ABPersonCopyCompositeNameDelimiterForRecord")
    public static native String getCompositeNameDelimiter(ABRecord record);
    @GlobalFunction("ABPersonSetImageData")
    public static native boolean setImageData(ABRecord person, NSData imageData, Todo error);
    @GlobalFunction("ABPersonCopyImageData")
    public static native NSData getImageData(ABRecord person);
    /**
     * @since Available in iOS 4.1 and later.
     */
    @GlobalFunction("ABPersonCopyImageDataWithFormat")
    public static native NSData getImageData(ABRecord person, ABPersonImageFormat format);
    @GlobalFunction("ABPersonHasImageData")
    public static native boolean hasImageData(ABRecord person);
    @GlobalFunction("ABPersonRemoveImageData")
    public static native boolean removeImageData(ABRecord person, Todo error);
    @GlobalFunction("ABPersonComparePeopleByName")
    public static native CFComparisonResult compareTo(ABRecord person1, ABRecord person2, @Representing("ABPersonSortOrdering") long ordering);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("ABPersonCreatePeopleInSourceWithVCardRepresentation")
    public static native List<ABPerson> createPeopleInSource(ABRecord source, NSData vCardData);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("ABPersonCreateVCardRepresentationWithPeople")
    public static native NSData createVCardRepresentation(NSArray<?> people);
    
}
