<template>
	<view class="content">
		<form class="app-update-pv">
			
									<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}' class="title">身份证号</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"68rpx"}' :disabled="ro.shenfenzhenghao" v-model="ruleForm.shenfenzhenghao" placeholder="身份证号"></input>
			</view>
												<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}' class="title">密码</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"68rpx"}' :disabled="ro.mima" v-model="ruleForm.mima" placeholder="密码"></input>
			</view>
												<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}' class="title">姓名</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"68rpx"}' :disabled="ro.xingming" v-model="ruleForm.xingming" placeholder="姓名"></input>
			</view>
												<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}' class="title">出生日期</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"68rpx"}' :disabled="ro.chushengriqi" v-model="ruleForm.chushengriqi" placeholder="出生日期"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(224, 227, 225, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}' class="title">性别</view>
				<picker @change="xingbieChange" :value="xingbieIndex" :range="xingbieOptions">
					<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"68rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
				</picker>
			</view>
												<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}' class="title">民族</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"68rpx"}' :disabled="ro.minzu" v-model="ruleForm.minzu" placeholder="民族"></input>
			</view>
												<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}' class="title">职业</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"68rpx"}' :disabled="ro.zhiye" v-model="ruleForm.zhiye" placeholder="职业"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(224, 227, 225, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}' class="title">婚姻状况</view>
				<picker @change="hunyinzhuangkuangChange" :value="hunyinzhuangkuangIndex" :range="hunyinzhuangkuangOptions">
					<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"68rpx"}' class="uni-input">{{ruleForm.hunyinzhuangkuang?ruleForm.hunyinzhuangkuang:"请选择婚姻状况"}}</view>
				</picker>
			</view>
												<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}' class="title">文化程度</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"68rpx"}' :disabled="ro.wenhuachengdu" v-model="ruleForm.wenhuachengdu" placeholder="文化程度"></input>
			</view>
												<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}' class="title">血型</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"68rpx"}' :disabled="ro.xuexing" v-model="ruleForm.xuexing" placeholder="血型"></input>
			</view>
												<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}' class="title">手机</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"68rpx"}' :disabled="ro.shouji" v-model="ruleForm.shouji" placeholder="手机"></input>
			</view>
												<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}' class="title">健康状况</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"68rpx"}' :disabled="ro.jiankangzhuangkuang" v-model="ruleForm.jiankangzhuangkuang" placeholder="健康状况"></input>
			</view>
												<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}' class="title">暂住地址</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"68rpx"}' :disabled="ro.zanzhudizhi" v-model="ruleForm.zanzhudizhi" placeholder="暂住地址"></input>
			</view>
												<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}' class="title">户籍所在地</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"68rpx"}' :disabled="ro.hujisuozaidi" v-model="ruleForm.hujisuozaidi" placeholder="户籍所在地"></input>
			</view>
																											
			<!-- 否 -->
 
			
			          				          				          				          				          				          				          				          				          				          				          				          				          				          				          				          							
			          				          				          				          				          				          				          				          				          				          				          				          				          				          				          				          							
			<view class="btn">
				<button :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"rgba(0, 102, 51, 1)","borderColor":"#409EFF","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"70%","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

																																																																					
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				ruleForm: {
												shenfenzhenghao: '',
																mima: '',
																xingming: '',
																chushengriqi: '',
																xingbie: '',
																minzu: '',
																zhiye: '',
																hunyinzhuangkuang: '',
																wenhuachengdu: '',
																xuexing: '',
																shouji: '',
																jiankangzhuangkuang: '',
																zanzhudizhi: '',
																hujisuozaidi: '',
																sfsh: '',
																shhf: '',
												},
																																												xingbieOptions: [],
				xingbieIndex: 0,
																																hunyinzhuangkuangOptions: [],
				hunyinzhuangkuangIndex: 0,
																																																																												// 登陆用户信息
				user: {},
                                ro:{
                                   shenfenzhenghao : false,
                                   mima : false,
                                   xingming : false,
                                   chushengriqi : false,
                                   xingbie : false,
                                   minzu : false,
                                   zhiye : false,
                                   hunyinzhuangkuang : false,
                                   wenhuachengdu : false,
                                   xuexing : false,
                                   shouji : false,
                                   jiankangzhuangkuang : false,
                                   zanzhudizhi : false,
                                   hujisuozaidi : false,
                                   sfsh : false,
                                   shhf : false,
                                },
			}
		},
		components: {
			wPicker
		},
		computed: {
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
					},
		async onLoad(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
						// ss读取
																																																																																																						
																																				// 自定义下拉框值
			this.xingbieOptions = "男,女".split(',')
																								// 自定义下拉框值
			this.hunyinzhuangkuangOptions = "已婚,未婚".split(',')
																																																									
			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`wailairenkou`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='shenfenzhenghao'){
					this.ruleForm.shenfenzhenghao = obj[o];
					this.ro.shenfenzhenghao = true;
					continue;
					}
					if(o=='mima'){
					this.ruleForm.mima = obj[o];
					this.ro.mima = true;
					continue;
					}
					if(o=='xingming'){
					this.ruleForm.xingming = obj[o];
					this.ro.xingming = true;
					continue;
					}
					if(o=='chushengriqi'){
					this.ruleForm.chushengriqi = obj[o];
					this.ro.chushengriqi = true;
					continue;
					}
					if(o=='xingbie'){
					this.ruleForm.xingbie = obj[o];
					this.ro.xingbie = true;
					continue;
					}
					if(o=='minzu'){
					this.ruleForm.minzu = obj[o];
					this.ro.minzu = true;
					continue;
					}
					if(o=='zhiye'){
					this.ruleForm.zhiye = obj[o];
					this.ro.zhiye = true;
					continue;
					}
					if(o=='hunyinzhuangkuang'){
					this.ruleForm.hunyinzhuangkuang = obj[o];
					this.ro.hunyinzhuangkuang = true;
					continue;
					}
					if(o=='wenhuachengdu'){
					this.ruleForm.wenhuachengdu = obj[o];
					this.ro.wenhuachengdu = true;
					continue;
					}
					if(o=='xuexing'){
					this.ruleForm.xuexing = obj[o];
					this.ro.xuexing = true;
					continue;
					}
					if(o=='shouji'){
					this.ruleForm.shouji = obj[o];
					this.ro.shouji = true;
					continue;
					}
					if(o=='jiankangzhuangkuang'){
					this.ruleForm.jiankangzhuangkuang = obj[o];
					this.ro.jiankangzhuangkuang = true;
					continue;
					}
					if(o=='zanzhudizhi'){
					this.ruleForm.zanzhudizhi = obj[o];
					this.ro.zanzhudizhi = true;
					continue;
					}
					if(o=='hujisuozaidi'){
					this.ruleForm.hujisuozaidi = obj[o];
					this.ro.hujisuozaidi = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},
																																																																																																						
			// 多级联动参数
																																																																																																						
																																																																																																			
																																																																																																			
																																	// 下拉变化
			xingbieChange(e) {
				this.xingbieIndex = e.target.value
				this.ruleForm.xingbie = this.xingbieOptions[this.xingbieIndex]
			},
																								// 下拉变化
			hunyinzhuangkuangChange(e) {
				this.hunyinzhuangkuangIndex = e.target.value
				this.ruleForm.hunyinzhuangkuang = this.hunyinzhuangkuangOptions[this.hunyinzhuangkuangIndex]
			},
																																																						
																																																																																																																																																			
			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												if((!this.ruleForm.shenfenzhenghao)){
					this.$utils.msg(`身份证号不能为空`);
					return
				}
																												if(this.ruleForm.shenfenzhenghao&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzhenghao))){
					this.$utils.msg(`身份证号应输入身份证格式`);
					return
				}
																				if((!this.ruleForm.mima)){
					this.$utils.msg(`密码不能为空`);
					return
				}
																																								if((!this.ruleForm.xingming)){
					this.$utils.msg(`姓名不能为空`);
					return
				}
																																																																																																																																																																																																																																																																																																																																																																																																																																																																				if(this.ruleForm.id){
					await this.$api.update(`wailairenkou`, this.ruleForm);
				}else{
					await this.$api.add(`wailairenkou`, this.ruleForm);
				}
				this.$utils.msgBack('提交成功');
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 68rpx;
	}
	
	.select .uni-input {
		line-height: 68rpx;
	}
	
	.input .right-input {
		line-height: 68rpx;
	}
</style>
