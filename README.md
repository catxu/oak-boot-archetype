# oak-boot-archetype

Base on maven-archetype-plugin built a DDD template project, for standardize project structure and facilitate code reuse.

## 创建项目

    mvn archetype:generate  -DarchetypeGroupId=com.oak.archetype  -DarchetypeArtifactId=oak-boot-archetype -DarchetypeVersion=1.0.0-SNAPSHOT  -DgroupId=com.oak.{projectName} -DartifactId={projectName} -Dversion=1.0.0-SNAPSHOT

**参数说明:**

    -DgroupId 指定group名,项目应以com.oak.开头
    -DartifactId 项目名
    -Dversion 项目版本号

