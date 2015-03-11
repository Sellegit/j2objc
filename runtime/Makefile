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
include classes.mk

JAR_NAME = runtime.jar
JAR = $(BUILD_DIR)/$(JAR_NAME)
DIST_JAR = $(DIST_JAR_DIR)/$(JAR_NAME)

JAR_DEPS = j2objc_annotations.jar
JAR_DEPS_DIST = $(JAR_DEPS:%=$(DIST_JAR_DIR)/%)
JAR_DEPS_PATH = $(subst $(eval) ,:,$(strip $(JAR_DEPS_DIST)))
CLASSPATH = $(CLASS_DIR):$(JAR_DEPS_PATH)

CLASSES_DIR = $(BUILD_DIR)/classes
JAVA_SOURCE_DIR = src/main/java

SOURCE_JAVA_FULL = $(ANNOTATION_SOURCE_JAVA:%=$(JAVA_SOURCE_DIR)/%)

$(BUILD_DIR) $(CLASSES_DIR) $(DIST_JAR_DIR):
	@mkdir -p $@

$(JAR): $(SOURCE_JAVA_FULL) | $(BUILD_DIR) $(CLASSES_DIR) annotations_dist
	@echo Building j2objc runtime
	@javac -classpath $(CLASSPATH) -d $(CLASSES_DIR) -source 1.6 -target 1.6 -nowarn $^
	@echo Jaring j2objc runtime
	@jar cf $(JAR) -C $(CLASSES_DIR) .

$(DIST_JAR): $(JAR) | $(DIST_JAR_DIR)
	@install -m 0644 $< $@

dist: $(DIST_JAR)
	@:

clean:
	@rm -rf $(BUILD_DIR) $(DIST_JAR)
