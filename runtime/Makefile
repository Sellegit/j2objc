# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# Builds the j2objc runtime lib as a .jar file.
#

SUFFIXES:

J2OBJC_ROOT = ..

include ../make/common.mk
include ../make/j2objc_deps.mk
include ../java_deps/jars.mk

JAVA_SOURCES = \
    com/google/j2objc/runtime/*.java \
    com/google/j2objc/runtime/**/*.java \
	apple/**/*.java

JAR_NAME = runtime.jar
JAR = $(BUILD_DIR)/$(JAR_NAME)
DIST_JAR = $(DIST_JAR_DIR)/$(JAR_NAME)

JAR_DEPS = j2objc_annotations.jar
JAR_DEPS_DIST = $(JAR_DEPS:%=$(DIST_JAR_DIR)/%)
JAR_DEPS_PATH = $(subst $(eval) ,:,$(strip $(JAR_DEPS_DIST)))
CLASSPATH = $(CLASS_DIR):$(JAR_DEPS_PATH)

CLASSES_DIR = $(BUILD_DIR)/classes
JAVA_SOURCE_DIR = src/main/java

SOURCE_JAVA_FULL = $(JAVA_SOURCES:%=$(JAVA_SOURCE_DIR)/%)

$(BUILD_DIR) $(CLASSES_DIR) $(DIST_JAR_DIR):
	@mkdir -p $@

$(JAR): $(SOURCE_JAVA_FULL) | $(BUILD_DIR) $(CLASSES_DIR) annotations_dist
	@echo Building j2objc runtime
	@javac -classpath $(CLASSPATH) -d $(CLASSES_DIR) -source 1.6 -target 1.6 -nowarn $^
	@echo Jaring j2objc runtime
	@jar cf $(JAR) -C $(CLASSES_DIR) .

$(DIST_JAR): $(JAR) | $(DIST_JAR_DIR)
	@install -m 0644 $< $@

TRANSLATE_JAVA_FULL = $(JAVA_SOURCES)
TRANSLATE_JAVA_RELATIVE = $(JAVA_SOURCES:$(SRC_DIR)/%=%)
TRANSLATE_ARGS = --segmented-headers --extract-unsequenced --batch-translate-max=300 \
    -cp $(CLASSPATH) -sourcepath $(SOURCEPATH) -encoding UTF-8 -J-Xmx2G \
    --hide-private-members --final-methods-as-functions -q
include ../make/translate.mk

FAT_LIB_NAME = runtime
FAT_LIB_SOURCES_RELATIVE = $(TRANSLATE_SOURCES:$(GEN_OBJC_DIR)/%=%)
FAT_LIB_SOURCE_DIRS = $(GEN_OBJC_DIR)
FAT_LIB_COMPILE = $(J2OBJCC)
include ../make/fat_lib.mk

DIST_LIBRARY = $(ARCH_LIB_DIR)/runtime.a

fat_lib_dependencies: annotations_dist

dist: $(DIST_JAR)
	@(cd $(GEN_OBJC_DIR) && tar cf - $(TRANSLATE_HEADERS:$(GEN_OBJC_DIR)/%=%)) \
	    | (cd $(ARCH_INCLUDE_DIR); tar xfp -)

clean:
	@rm -rf $(BUILD_DIR) $(DIST_JAR) $(DIST_LIBRARY)

$(DIST_LIBRARY): $(FAT_LIB_LIBRARY) | $(ARCH_LIB_DIR)
	install -m 0644 $< $@

