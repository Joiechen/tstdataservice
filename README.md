# tstdataservice
缘起：测试过程中有两类测试数据，“活水数据”和“死水数据”，其中“死水数据”是指那些相对稳定，不会在使用过程中改变状态，并且可以被多次使用的数据。
    “活水数据”指那些只能被一次性使用，或者经常会被修改的测试数据。
    在微服务越来越多的被应用到项目上之后，开始考虑将数据的生成发布为restful服务供测试人员和开发人员使用。