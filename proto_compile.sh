cd $(dirname $0)
SRC_DIR=./proto
DST_DIR=./src/main/java/
protoc -I=$SRC_DIR --java_out=$DST_DIR MessageEnums.proto --experimental_allow_proto3_optional
protoc -I=$SRC_DIR --java_out=$DST_DIR ValueRef.proto --experimental_allow_proto3_optional
protoc -I=$SRC_DIR --java_out=$DST_DIR AdvInfoFieldRef.proto --experimental_allow_proto3_optional
protoc -I=$SRC_DIR --java_out=$DST_DIR DataRow.proto --experimental_allow_proto3_optional
protoc -I=$SRC_DIR --java_out=$DST_DIR AdvInfoData.proto --experimental_allow_proto3_optional
protoc -I=$SRC_DIR --java_out=$DST_DIR AdvInfo.proto --experimental_allow_proto3_optional
protoc -I=$SRC_DIR --java_out=$DST_DIR Status.proto --experimental_allow_proto3_optional
protoc -I=$SRC_DIR --java_out=$DST_DIR Response.proto --experimental_allow_proto3_optional
protoc -I=$SRC_DIR --java_out=$DST_DIR Parameter.proto --experimental_allow_proto3_optional
protoc -I=$SRC_DIR --java_out=$DST_DIR OwnCommand.proto --experimental_allow_proto3_optional
protoc -I=$SRC_DIR --java_out=$DST_DIR Request.proto --experimental_allow_proto3_optional
protoc -I=$SRC_DIR --java_out=$DST_DIR Header.proto --experimental_allow_proto3_optional
protoc -I=$SRC_DIR --java_out=$DST_DIR Event.proto --experimental_allow_proto3_optional
protoc -I=$SRC_DIR --java_out=$DST_DIR ExchangeInfoMessage.proto --experimental_allow_proto3_optional